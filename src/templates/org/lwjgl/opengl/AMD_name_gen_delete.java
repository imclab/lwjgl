/*
 * Copyright (c) 2002-2008 LWJGL Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'LWJGL' nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.lwjgl.opengl;

import org.lwjgl.util.generator.*;
import org.lwjgl.util.generator.Alternate;
import org.lwjgl.util.generator.opengl.GLenum;
import org.lwjgl.util.generator.opengl.GLreturn;
import org.lwjgl.util.generator.opengl.GLsizei;
import org.lwjgl.util.generator.opengl.GLuint;

import java.nio.IntBuffer;

public interface AMD_name_gen_delete {

	/** Accepted as the &lt;identifier&gt; parameter of GenNamesAMD and DeleteNamesAMD: */
	int GL_DATA_BUFFER_AMD = 0x9151,
		GL_PERFORMANCE_MONITOR_AMD = 0x9152,
		GL_QUERY_OBJECT_AMD = 0x9153,
		GL_VERTEX_ARRAY_OBJECT_AMD = 0x9154,
		GL_SAMPLER_OBJECT_AMD = 0x9155;

	void glGenNamesAMD(@GLenum int identifier, @AutoSize("names") @GLuint int num, @OutParameter @GLuint IntBuffer names);

	@Alternate("glGenNamesAMD")
	@GLreturn("names")
	void glGenNamesAMD2(@GLenum int identifier, @Constant("1") @GLsizei int num, @OutParameter @GLuint IntBuffer names);

	void glDeleteNamesAMD(@GLenum int identifier, @AutoSize("names") @GLsizei int num, @Const @GLuint IntBuffer names);

	@Alternate("glDeleteNamesAMD")
	void glDeleteNamesAMD(@GLenum int identifier, @Constant("1") @GLsizei int num, @Constant(value = "APIUtil.getInt(caps, name)", keepParam = true) int name);

	boolean glIsNameAMD(@GLenum int identifier, @GLuint int name);

}