/*******************************************************************************
 * Copyright (c) 2016, 2021 IBM Corp. and others
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] http://openjdk.java.net/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0 WITH Classpath-exception-2.0 OR LicenseRef-GPL-2.0 WITH Assembly-exception
 *******************************************************************************/
package com.ibm.dump.tests.timestamp;


public class CreateDump {

	public static void main(String[] args) {

		try {
			java.lang.Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("com.ibm.dump.tests.timestamp.CreateJavaCore: nanotime before dump ###" + java.lang.System.nanoTime() + "###");
		
		 try {
			java.lang.Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		try {
			throw new com.ibm.dump.tests.timestamp.TestException();
		} catch (Exception e) {
		}
		
		try {
			java.lang.Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("com.ibm.dump.tests.timestamp.CreateJavaCore: nanotime after dump ###" + java.lang.System.nanoTime() + "###");
	}
}