/**
 *
 */
package br.javamagazine.learning.lambda.thread;

/**
 * I'm the thread runner!*
 *
 * * non related to the famous movie Blade Runner
 *
 * @author dinhego
 *
 */
public class ThreadRunner {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {

		final MyFirstThread meThread = new MyFirstThread("Deckard");

		meThread.start();

	}

}