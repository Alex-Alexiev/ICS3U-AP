package ca.bayviewglen.formatting;

import java.text.DecimalFormat;

public class DecimalFormatting {

	public static void main(String[] args) {
		
		double x = 56323323.56;
		
		//Decimal Formatter
		
		DecimalFormat formatter = new DecimalFormat("######.#");
		System.out.println(formatter.format(x));
		//the left side of the decimal will not get rid of or add something
		//the right side of the decimal will round to match the number of #'s
		//the right side will NOT pad with zeros
		
		formatter = new DecimalFormat("#######.0%");
		System.out.println(formatter.format(x));
		//using decimal format with a zero multiplies it by 100 
		//using 0 will pad with zeros for missing spots
		
		formatter = new DecimalFormat("###,###.000");
		System.out.println(formatter.format(x));

	}

}
