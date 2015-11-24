/**
 *
 */
package br.javamagazine.learning.lambda.pojo;

import java.math.BigDecimal;

/**
 * Represents a gamer through a gameplay
 *
 * @author dinhego
 *
 */
public class Gamer {

	private final String name;

	private final BigDecimal healthPercentage;

	/**
	 * Creates a single user of the videogame
	 *
	 * @param name
	 */
	public Gamer(final String name) {
		this.name = name;
		this.healthPercentage = new BigDecimal(100L);
	}

	// getters

	public String getName() {
		return this.name;
	}

	public BigDecimal getHealthPercentage() {
		return this.healthPercentage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Gamer {");
		if (this.name != null) {
			builder.append("name:\"");
			builder.append(this.name);
			builder.append("\", ");
		}
		if (this.healthPercentage != null) {
			builder.append("healthPercentage:");
			builder.append(this.healthPercentage);
		}
		builder.append("}");
		return builder.toString();
	}

}
