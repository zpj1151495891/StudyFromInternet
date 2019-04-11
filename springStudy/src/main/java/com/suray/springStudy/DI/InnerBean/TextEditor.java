package com.suray.springStudy.DI.InnerBean;

public class TextEditor {
	private SpellChecker spellChecker;
	
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside InnerBean.....");
		this.spellChecker=spellChecker;
	}
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void spellChecker() {
		spellChecker.checkSpelling();
	}

}
