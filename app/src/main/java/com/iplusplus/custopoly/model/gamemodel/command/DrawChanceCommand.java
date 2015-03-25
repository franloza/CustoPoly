package com.iplusplus.custopoly.model.gamemodel.command;

import com.iplusplus.custopoly.model.gamemodel.controller.Controller;
import com.iplusplus.custopoly.model.gamemodel.element.Card;

import java.util.ArrayList;

public class DrawChanceCommand extends DrawCardCommand {

	@Override
	protected ArrayList<Card> getCards(Controller controller) {
		return controller.getGame().getBank().getChanceCards();
	}

}
