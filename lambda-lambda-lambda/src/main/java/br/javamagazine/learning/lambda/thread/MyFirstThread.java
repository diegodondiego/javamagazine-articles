/**
 *
 */
package br.javamagazine.learning.lambda.thread;

/**
 * OMG, it's a thread!
 *
 * @author dinhego
 *
 */
public class MyFirstThread extends Thread {

	private final String myName;

	/**
	 * Instance the thread with my name
	 *
	 * @param myName
	 */
	public MyFirstThread(final String myName) {

		this.myName = myName;
		this.setName(new StringBuilder("PrinterThread{").append(myName).append("}").toString());
	}

	// getters

	public String getMyName() {
		return this.myName;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		System.out.println(new StringBuilder("Hello, ").append(this.myName)
				.append("! You just created a Thread with the name: ").append(this.getName()));
	}
}
