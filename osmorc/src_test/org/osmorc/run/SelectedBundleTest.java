/*
 * Copyright (c) 2007-2009, Osmorc Development Team
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright notice, this list
 *       of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright notice, this
 *       list of conditions and the following disclaimer in the documentation and/or other
 *       materials provided with the distribution.
 *     * Neither the name of 'Osmorc Development Team' nor the names of its contributors may be
 *       used to endorse or promote products derived from this software without specific
 *       prior written permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT
 * OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.osmorc.run;

import org.junit.Test;
import org.osmorc.run.ui.SelectedBundle;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author <a href="mailto:robert@beeger.net">Robert F. Beeger</a>
 */
public class SelectedBundleTest {
  @Test
  public void testToString() {
    SelectedBundle testObject = new SelectedBundle(SelectedBundle.BundleType.Module, "testName", "/test/path");
    assertThat(testObject.toString(), equalTo("testName (path)"));
    testObject = new SelectedBundle(SelectedBundle.BundleType.Module, "testName", null);
    assertThat(testObject.toString(), equalTo("testName"));
  }

  @Test
  public void testEquals() {
    SelectedBundle testObject = new SelectedBundle(SelectedBundle.BundleType.Module, "testName", "/test/path");
    assertThat(testObject, equalTo(testObject));
    testObject = new SelectedBundle(SelectedBundle.BundleType.Module, "testName", null);
    assertThat(testObject, equalTo(testObject));
    testObject = new SelectedBundle(SelectedBundle.BundleType.PlainLibrary, "testName", "/test/path");
    assertThat(testObject, equalTo(testObject));
    testObject = new SelectedBundle(SelectedBundle.BundleType.PlainLibrary, "testName", null);
    assertThat(testObject, equalTo(testObject));
  }
}
