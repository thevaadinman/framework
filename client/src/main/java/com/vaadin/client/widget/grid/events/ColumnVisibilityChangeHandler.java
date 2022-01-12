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
package com.vaadin.client.widget.grid.events;

import com.google.gwt.event.shared.EventHandler;

/**
 * Handler for a Grid column visibility change event, called when the Grid's
 * columns have changed visibility to hidden or visible.
 *
 * @param<T> The
 *               row type of the grid. The row type is the POJO type from where
 *               the data is retrieved into the column cells.
 *
 * @since 7.5.0
 * @author Vaadin Ltd
 */
public interface ColumnVisibilityChangeHandler<T> extends EventHandler {

    /**
     * A column visibility change event, fired by Grid when a column in the Grid
     * has changed visibility.
     *
     * @param event
     *            column visibility change event
     */
    public void onVisibilityChange(ColumnVisibilityChangeEvent<T> event);
}
