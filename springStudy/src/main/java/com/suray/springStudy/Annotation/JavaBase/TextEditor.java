package com.suray.springStudy.Annotation.JavaBase;

public class TextEditor {
	
	private SpellChecker spellChecker;
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor Constructor");
		this.spellChecker=spellChecker;
	}
	public void spellChecker() {
		spellChecker.checkSpelling();
	}

}
