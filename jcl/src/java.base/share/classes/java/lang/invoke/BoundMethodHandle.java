/*[INCLUDE-IF !OPENJDK_METHODHANDLES & !VENDOR_UMA]*/
/*
 * Copyright IBM Corp. and others 2017
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
 * [2] https://openjdk.org/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0-only WITH Classpath-exception-2.0 OR GPL-2.0-only WITH OpenJDK-assembly-exception-1.0
 */
package java.lang.invoke;

/*
 * Stub class to compile RI j.l.i.MethodHandleImpl
 */
abstract class BoundMethodHandle extends MethodHandle {

	BoundMethodHandle(MethodType mt, LambdaForm lf) {
		super(mt, lf);
		OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

	LambdaFormEditor editor() {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

	static SpeciesData speciesData(LambdaForm lf) {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	static SpeciesData speciesData_L() {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	static SpeciesData speciesData_LL() {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	static SpeciesData speciesData_LLL() {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	static SpeciesData speciesData_LLLL() {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
	static SpeciesData speciesData_LLLLL() {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

	LambdaForm.NamedFunction getterFunction(int num) {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

/*[IF JAVA_SPEC_VERSION >= 15]*/
	final int fieldCount() {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}

	final Object arg(int i) {
		throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
	}
/*[ENDIF] JAVA_SPEC_VERSION >= 15 */

	class SpeciesData {
		MethodHandle constructor() {
			throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}

		LambdaForm.NamedFunction getterFunction(int num) {
			throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}

		/*[IF JAVA_SPEC_VERSION >= 10]*/
		MethodHandle factory() {
			throw OpenJDKCompileStub.OpenJDKCompileStubThrowError();
		}
		/*[ENDIF] JAVA_SPEC_VERSION >= 10 */
	}

	abstract BoundMethodHandle copyWithExtendL(MethodType mt, LambdaForm lf, Object obj);

	abstract BoundMethodHandle copyWith(MethodType mt, LambdaForm lf);
}
