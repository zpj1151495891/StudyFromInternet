package com.suray.springStudy.AutoWire.Constructor;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	
	public TextEditor(SpellChecker spellChecker,String name) {
		this.spellChecker=spellChecker;
		this.name=name;
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void spellChecker() {
		spellChecker.checkSpelling();
	}
	
}
