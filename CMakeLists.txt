################################################################################
# Copyright IBM Corp. and others 2018
#
# This program and the accompanying materials are made available under
# the terms of the Eclipse Public License 2.0 which accompanies this
# distribution and is available at https://www.eclipse.org/legal/epl-2.0/
# or the Apache License, Version 2.0 which accompanies this distribution and
# is available at https://www.apache.org/licenses/LICENSE-2.0.
#
# This Source Code may also be made available under the following
# Secondary Licenses when the conditions for such availability set
# forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
# General Public License, version 2 with the GNU Classpath
# Exception [1] and GNU General Public License, version 2 with the
# OpenJDK Assembly Exception [2].
#
# [1] https://www.gnu.org/software/classpath/license.html
# [2] https://openjdk.org/legal/assembly-exception.html
#
# SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0-only WITH Classpath-exception-2.0 OR GPL-2.0-only WITH OpenJDK-assembly-exception-1.0
################################################################################

cmake_minimum_required(VERSION 3.5 FATAL_ERROR)

project(openj9)

if("${BOOT_JDK}" STREQUAL "")
	message(FATAL_ERROR "BOOT_JDK must be defined")
endif()

message(STATUS "Using BOOT_JDK: '${BOOT_JDK}'")

# These variables are used by "Java" language support.
find_program(CMAKE_Java_COMPILER NAMES javac PATHS ${BOOT_JDK}/bin NO_DEFAULT_PATH)
find_program(CMAKE_Java_RUNTIME  NAMES java  PATHS ${BOOT_JDK}/bin NO_DEFAULT_PATH)
find_program(CMAKE_Java_AR       NAMES jar   PATHS ${BOOT_JDK}/bin NO_DEFAULT_PATH)

# Variables used by the "UseJava" module (predates "Java" language support)
set(Java_JAVA_EXECUTABLE ${CMAKE_Java_RUNTIME})
set(Java_JAVAC_EXECUTABLE ${CMAKE_Java_COMPILER})
set(Java_JAR_EXECUTABLE ${CMAKE_Java_AR})

add_subdirectory(sourcetools)
add_subdirectory(runtime)
