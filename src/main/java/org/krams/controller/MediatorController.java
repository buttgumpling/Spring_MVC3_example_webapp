package org.krams.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MediatorController {

	@RequestMapping
	public String getHomePage() {
		return "home";
	}
	
	@RequestMapping(value="/user")
	public String getUserPage() {
		return "user";
	}
	
	@RequestMapping(value="/admin")
	public String getAdminPage() {
		return "admin";
	}
        
        @RequestMapping(value="/admin/manage_profile")
	public String getManageProfilePage() {
		return "manage_profile";
	}
        
        @RequestMapping(value="/admin/file_upload")
	public String getFileUploadPage() {
		return "file_upload";
	}
        
}
