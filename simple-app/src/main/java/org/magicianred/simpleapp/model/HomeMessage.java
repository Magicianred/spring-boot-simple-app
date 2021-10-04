package org.magicianred.simpleapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HomeMessage {
	@JsonProperty("id")
	public int Id;
	@JsonProperty("title")
	public String Title;
	@JsonProperty("text")
	public String Text;
	@JsonProperty("imagesrc")
	public String ImageSrc;
	@JsonProperty("link")
	public String Link;
}
