package com.iplusplus.custopoly.model.gamemodel.element;

import com.iplusplus.custopoly.model.gamemodel.behaviour.ConstructionAllowance;
import com.iplusplus.custopoly.model.gamemodel.command.PayFeeCommand;

public class PayTax extends SpecialLand {
	private int taxAmount;
	
	public PayTax(int taxAmount) {
		this.taxAmount = taxAmount;
		setConstructionBehavior(ConstructionAllowance.CONSTRUCTION_DENIED);
		setAssignment(new PayFeeCommand(taxAmount));
	}
	
	public int getTaxAmount(){
		return taxAmount;
	}
	
	@Override
	public String getName() {
		return "PayTax";
	}

}
