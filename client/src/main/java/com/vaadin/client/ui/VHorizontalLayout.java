/*
 * Copyright 2000-2022 Vaadin Ltd.
 *
 * Licensed under the Commercial Vaadin Developer License version 4.0 (CVDLv4);
 * you may not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 * https://vaadin.com/license/cvdl-4.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.client.ui;

import com.vaadin.client.StyleConstants;
import com.vaadin.client.ui.orderedlayout.VAbstractOrderedLayout;

/**
 * Represents a layout where the children is ordered vertically
 */
public class VHorizontalLayout extends VAbstractOrderedLayout {

    public static final String CLASSNAME = "v-horizontallayout";

    /**
     * Default constructor
     */
    public VHorizontalLayout() {
        super(false);
        setStyleName(CLASSNAME);
    }

    @Override
    public void setStyleName(String style) {
        super.setStyleName(style);
        addStyleName(StyleConstants.UI_LAYOUT);
        addStyleName("v-horizontal");
    }
}
