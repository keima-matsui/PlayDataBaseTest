package controllers;

import java.util.List;

import models.UserMaster;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.index;

/**
 * 
 * Controller Class
 *
 */
 
public class Application extends Controller {

	/**
	 * Index Process
	 *
	 * @return Result
	 */
	public Result index() {
		// Find UserMaster.
		List<UserMaster> userMasterList = UserMaster.getFind().all();
		for (UserMaster data : userMasterList) {
			// Name Output.
			System.out.println(data.getUserName());
		}
		// Show index.
		return ok(index.render("Your new application is ready."));
	}
	
	

}