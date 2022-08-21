/**
 * 
 */
package com.mail.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mail.dto.WelcomeMsg;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Vikas
 * @date 21-Aug-2022
 * @version 
 */
@RestController
@RequestMapping("/mailer")
@Slf4j
public class MailerController {
	/**
	 * method to show the default msg to user
	 */
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<WelcomeMsg> getWelcomeMsg() {
		log.info("********* Mailer Application *********");
		WelcomeMsg welcomeMsg = new WelcomeMsg("Welcome To Mailer Application");
		log.info("********* Welcome msg = "+ welcomeMsg.getMsg()+" *********");
		return ResponseEntity.ok(welcomeMsg);
	}
}
