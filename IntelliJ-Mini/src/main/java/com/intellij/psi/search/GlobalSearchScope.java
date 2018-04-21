/*
 * Copyright 2000-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.psi.search;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GlobalSearchScope extends SearchScope {

    @Nullable
    public static final GlobalSearchScope EMPTY_SCOPE = new GlobalSearchScope();

    public static GlobalSearchScope allScope(Project project) {
        return new GlobalSearchScope();
    }

    public static GlobalSearchScope fileScope(PsiFile file) {
        throw new Error();
    }

    @Nullable private final Project myProject;

    protected GlobalSearchScope(@Nullable Project project) {
        myProject = project;
    }

    protected GlobalSearchScope() {
        this(null);
    }

    @Nullable
    public Project getProject() {
        return myProject;
    }

    @NotNull
    @Override
    public SearchScope intersectWith(@NotNull SearchScope scope2) {
        return null;
    }

    @NotNull
    @Override
    public SearchScope union(@NotNull SearchScope scope) {
        return null;
    }

    @Override
    public boolean contains(@NotNull VirtualFile file) {
        return false;
    }
}
