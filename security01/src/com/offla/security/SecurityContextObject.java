package com.offla.security;

import javax.security.auth.Subject;

import com.ibm.json.java.JSONObject;
import com.ibm.websphere.security.WSSecurityException;
import com.ibm.websphere.security.auth.WSSubject;
import com.ibm.websphere.security.cred.WSCredential;
import com.worklight.oauth.tai.WLCredential;

public class SecurityContextObject {
	
	Subject callerSubject = null;
	
	public SecurityContextObject(){}
	
	public void trySecurity(){
	
	try{
	Subject callerSubject = WSSubject.getCallerSubject();
	}catch(WSSecurityException ws){
		
	}
	WSCredential callerCredential = callerSubject.getPublicCredentials(WSCredential.class).iterator().next();
	WLCredential callerWLCredential = callerSubject.getPublicCredentials(WLCredential.class).iterator().next();
	
	JSONObject securityContext = callerWLCredential.getSecurityContext();
	String userIdentity = (String) securityContext.get("imf.sub");
	JSONObject imfUser = (JSONObject) securityContext.get("imf.user");
	JSONObject imfDevice = (JSONObject) securityContext.get("imf.device");
	JSONObject imfApplication = (JSONObject) securityContext.get("imf.application");
	}

}
