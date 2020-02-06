/*
 * Copyright (c) Feb 3, 2020 StarChart Labs Authors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    romeara - initial API and implementation and/or initial documentation
 */
package org.starchartlabs.helsing.test.project;

import org.starchartlabs.helsing.test.project.other.UsedByConstantImported;

/**
 * This class uses others in specific ways, for testing they aren't marked as dead
 *
 * @author romeara
 */
@ClassAnnotation
public class UsesOtherClasses extends UsedViaExtension {

    @MethodAnnotation
    public int getThing(@FieldAnnotation String input) {
        return new UsedViaSimpleMethod().add(1, 2);
    }

    public int getOtherThing() {
        return UsedViaStaticMethod.multiply(3, 4);
    }

    public String getSamePackageSimpleNameConstant() {
        return UsedByConstantSimpleName.CONSTANT + UsedByConstantImported.CONSTANT;
    }

    public String getSamePackageQualifiedNameConstant() {
        return org.starchartlabs.helsing.test.project.UsedByConstantFullName.CONSTANT
                + org.starchartlabs.helsing.test.project.other.UsedByConstantFullName.CONSTANT;
    }

}
