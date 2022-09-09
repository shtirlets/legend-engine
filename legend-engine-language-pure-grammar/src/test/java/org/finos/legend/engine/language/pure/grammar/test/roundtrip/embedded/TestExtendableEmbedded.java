// Copyright 2020 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.language.pure.grammar.test.roundtrip.embedded;

import org.finos.legend.engine.language.pure.grammar.test.TestGrammarRoundtrip;
import org.junit.Test;

public class TestExtendableEmbedded extends TestGrammarRoundtrip.TestGrammarRoundtripTestSuite
{
    @Test
    public void testGraphQLDefault()
    {
        test("function f(): Any[*]\n" +
                "{\n" +
                "   let x = #{a{a}}#\n" +
                "}\n");
    }

    @Test
    public void testTestExtension()
    {
        test("function f(): Any[*]\n" +
                "{\n" +
                "   let x = #Test{My random Parser Yo}#\n" +
                "}\n");
    }

    @Test
    public void testTestNestedExtension()
    {
        test("function f(): Any[*]\n" +
                "{\n" +
                "   let x = #Test{My random Parser #Test{ OK OK } Yo}#\n" +
                "}\n");
    }
}
