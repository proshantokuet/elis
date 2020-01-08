/*
* The contents of this file are subject to the Mozilla Public License
* Version 1.1 (the "License"); you may not use this file except in
* compliance with the License. You may obtain a copy of the License at
* http://www.mozilla.org/MPL/ 
* 
* Software distributed under the License is distributed on an "AS IS"
* basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
* License for the specific language governing rights and limitations under
* the License.
* 
* The Original Code is OpenELIS code.
* 
* Copyright (C) The Minnesota Department of Health.  All Rights Reserved.
*/

package us.mn.state.health.lims.ws;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.bahmni.feed.openelis.ObjectMapperRepository;

import us.mn.state.health.lims.sampleitem.daoimpl.SampleItemDAOImpl;

public class PaymentResourceRetrieveAction extends WebServiceAction {

    private final String APPLICATION_JSON = "application/json";
   
    public PaymentResourceRetrieveAction() {
       
    }

   
    @Override
    protected ActionForward performAction(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                          HttpServletResponse response) throws Exception {
        
        System.err.println("OKKKKKKKKKKKKKKKKkk");
        
        String patientId = request.getParameter("patient_id");
        String panels = request.getParameter("panels");
        panels =  panels.replaceAll(",$", "");
        SampleItemDAOImpl sampleItemDAOImpl = new SampleItemDAOImpl();
        String msg = sampleItemDAOImpl.getSampleItemIdByPatient(patientId,panels);
        
        
        System.out.println("patientId:"+patientId+ " Panels:"+panels);
        Map<String,String> rsponse = new HashMap<>();
        rsponse.put("response", msg);
        response.setContentType(APPLICATION_JSON);
        ObjectMapperRepository.objectMapper.writeValue(response.getWriter(), rsponse);

        return null;
    }

  
}
