
package org.thoughtslive.jenkins.plugins.jira.api;

import java.io.Serializable;

import org.joda.time.DateTime;
import org.kohsuke.stapler.DataBoundConstructor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor(onConstructor = @__({@DataBoundConstructor}))
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class Attachment implements Serializable {

	private final static long serialVersionUID = 3112598371329647518L;

	@JsonProperty("id")
	private String id;

	@JsonProperty("filename")
	private String filename;

	@JsonProperty("author")
	private User author;

	@JsonProperty("created")
	private DateTime created;

	@JsonProperty("size")
	private Integer size;

	@JsonProperty("mimeType")
	private String mimeType;

	@JsonProperty("content")
	private String content;
}