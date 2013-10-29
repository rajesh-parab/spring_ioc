package com.rajesh.spring.property.editor;

import java.beans.PropertyEditorSupport;

public class TyreTypeEditor extends PropertyEditorSupport {

	private String format;

	public void setFormat(String format) {
		this.format = format;
	}

	public void setAsText(String text) {
		if (format != null && format.equals("upperCase")) {
			text = text.toUpperCase();
		}
		Tyre type = new Tyre(text);
		setValue(type);
	}
}
