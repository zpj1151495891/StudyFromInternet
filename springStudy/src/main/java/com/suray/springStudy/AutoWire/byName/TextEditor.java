package com.suray.springStudy.AutoWire.byName;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker=spellChecker;
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
