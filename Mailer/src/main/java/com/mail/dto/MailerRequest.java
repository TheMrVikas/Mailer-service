/**
 * 
 */
package com.mail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Vikas
   21-Aug-2022
   MailerDto.java
   2022
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailerRequest {
	private String to;
	private String body;
	private String from;
	private String subject;
}
