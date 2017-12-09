package azevedorafaela.cucumbermaven.pages;

import org.openqa.selenium.support.PageFactory;

import azevedorafaela.cucumbermaven.support.World;

public abstract class BasePage {

	protected World world;

	public BasePage(World world) {
		this.world = world;
		PageFactory.initElements(world.driver, this);
	}
}
