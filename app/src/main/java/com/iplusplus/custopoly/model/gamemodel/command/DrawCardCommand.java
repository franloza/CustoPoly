package com.iplusplus.custopoly.model.gamemodel.command;

import android.app.AlertDialog;
import android.content.Context;
import com.iplusplus.custopoly.model.gamemodel.controller.Controller;
import com.iplusplus.custopoly.model.gamemodel.element.Card;
import com.iplusplus.custopoly.model.gamemodel.element.Game;

import java.util.ArrayList;

public abstract class DrawCardCommand implements Command {
	
	@Override
	public void execute(Game game, Context context) {
		ArrayList<Card> cards = getCards(game);
		Card drawnCard = cards.remove(0);
		
		displayText(drawnCard.text, context);
		drawnCard.command.execute(game, context);
		
		cards.add(drawnCard);
	}

    /** TODO
     * Displays a dialog with some text.
     * @param text
     */
	private void displayText(String text, Context context) {
		AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setMessage(text).show();
	}
	
	protected abstract ArrayList<Card> getCards(Game game);
	
}
