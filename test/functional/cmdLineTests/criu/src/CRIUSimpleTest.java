/*******************************************************************************
 * Copyright (c) 2022, 2022 IBM Corp. and others
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

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.openj9.criu.CRIUSupport;

public class CRIUSimpleTest {

  public static void main(String args[]) {
    /* JVM startup */
    //checkPointJVM();

    System.out.println("Pre-checkpoint");

    // /* perform application init */
    // int numberOfPrimes = sieveOfEratosthenes(10000000).size();


    checkPointJVM();

    /* Application ready */
    System.out.println("Post-checkpoint");
    // System.out.println("Number of primes between 0 and 10,000,000: " + numberOfPrimes);

  }

  public static void checkPointJVM() {
    if (CRIUSupport.isCRIUSupportEnabled()) {

        System.out.println("testtest3");

        new CRIUSupport(Paths.get("cpData"))
                        .setLeaveRunning(false)
                        .setShellJob(true)
                        .checkpointJVM();

        System.out.println("testtest4");

    } else {
      System.err.println("CRIU is not enabled");
    }
  }

  // public static List<Integer> sieveOfEratosthenes(int n) {
  //   boolean prime[] = new boolean[n + 1];
  //   Arrays.fill(prime, true);
  //   for (int p = 2; p * p <= n; p++) {
  //     if (prime[p]) {
  //       for (int i = p * 2; i <= n; i += p) {
  //         prime[i] = false;
  //       }
  //     }
  //   }
  //   List<Integer> primeNumbers = new LinkedList<>();
  //   for (int i = 2; i <= n; i++) {
  //     if (prime[i]) {
  //       primeNumbers.add(i);
  //     }
  //   }
  //   return primeNumbers;
  // }
}
