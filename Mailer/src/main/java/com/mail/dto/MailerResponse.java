/**
 * 
 */
package com.mail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author Vikas
 * @date 21-Aug-2022
 * @version
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailerResponse {
	private String message;
	private Boolean status;
}
