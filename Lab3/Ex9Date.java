package Lab3;

import java.time.*;
import java.util.*;

public class Ex9Date {
	public static void main(String[] args) {

		LocalDate pdate = LocalDate.of(2021, 05, 04);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate, now);

		System.out.printf("Difference = %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());

	}

}