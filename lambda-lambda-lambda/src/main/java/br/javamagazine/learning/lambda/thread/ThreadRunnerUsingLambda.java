/**
 *
 */
package br.javamagazine.learning.lambda.thread;

import static java.lang.System.out;

/**
 * I'm the thread runner*, but using lambda.
 *
 * * non related to the famous movie Blade Runner
 *
 * @author dinhego
 *
 */
public class ThreadRunnerUsingLambda {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		new Thread(() -> {
			out.println(new StringBuilder("Hello, Deckard! You just created a Thread using lambda with the name: ")
					.append("[sorry! no access to in static context.]"));
		}).start();

	}

}