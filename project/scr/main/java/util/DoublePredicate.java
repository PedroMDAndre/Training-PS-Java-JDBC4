package util;

import javax.sql.RowSet;
import javax.sql.rowset.Predicate;

public class DoublePredicate implements Predicate {
	
	RationalOperator ro = null;
	
	public DoublePredicate(RationalOperator rationalOperator) {
		ro = rationalOperator;
	}
	
	public boolean evaluate(Object value, int column) {
		return false;
	}
	
	public boolean evaluate(Object value, String columnName) {
		return false;
	}
	
	public boolean evaluate(RowSet rs) {
		return false;
	}
	
	private boolean test(RationalOperator rationalOperator, Double value, Double boundryValue1, Double bountryValue2) {
		
		if( rationalOperator == null || 
			value == null ||
			boundryValue1 == null ||
			bountryValue2 == null && rationalOperator == RationalOperator.BETWEEN_INC ||
			bountryValue2 == null && rationalOperator == RationalOperator.BETWEEN_EX) {
			
			return false;
		}
		return switch (rationalOperator) {
			case EQUALS -> (value == boundryValue1);
			case NOT_EQUAL -> (value != boundryValue1);
			case GREATER_THAN -> (value > boundryValue1);
			case GREATER_THAN_OR_EQUAL -> (value <= boundryValue1);
			case LESS_THAN -> (value < boundryValue1);
			case LESS_THAN_OR_EQUAL -> (value >= boundryValue1);
			case BETWEEN_INC -> (value >= boundryValue1 && value <= boundryValue1);
			case BETWEEN_EX -> (value > boundryValue1 && value < boundryValue1);
		};

	}
}
