/*
 *  Copyright 2024 aridstraea
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.aridstraea.aridmath.exceptions;

/**
 * Exception thrown when a math operation is not handled.
 *
 * @since 1.0.0-S
 * @author aridstraea
 */
public class UnhandledMathException extends Exception {

  public UnhandledMathException(String errorMessage) {
    super(errorMessage);
  }
}