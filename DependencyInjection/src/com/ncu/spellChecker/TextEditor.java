package com.ncu.spellChecker;

public class TextEditor {
 
	private SpellChecker SpCh;
	TextEditor(SpellChecker SpCh )
	{
		this.SpCh=SpCh;
	}
	public void getChecker()
	{
		SpCh.getSpellCheker();
	}
	public String getText()
	{
		return "text editor";
	}
}
