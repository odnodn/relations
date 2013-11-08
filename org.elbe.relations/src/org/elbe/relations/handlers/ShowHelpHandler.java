/***************************************************************************
 * This package is part of Relations application.
 * Copyright (C) 2004-2013, Benno Luthiger
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 ***************************************************************************/
package org.elbe.relations.handlers;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.elbe.relations.RelationsConstants;
import org.elbe.relations.help.base.Constants;

/**
 * Opens the browser to show the help content.
 * 
 * @author Luthiger
 */
public class ShowHelpHandler {
	private static final int HELP_HEIGHT = 700;
	private static final int HELP_WIDTH = 1000;

	@Execute
	void showHelp(final MApplication inApplication,
			final IEclipseContext inContext) {
		final MTrimmedWindow lHelpWindow = MBasicFactory.INSTANCE
				.createTrimmedWindow();
		lHelpWindow.setHeight(HELP_HEIGHT);
		lHelpWindow.setWidth(HELP_WIDTH);
		lHelpWindow.setLabel("Help");
		lHelpWindow.getTags().add(RelationsConstants.WINDOW_HELP);
		lHelpWindow
				.setIconURI("platform:/plugin/org.elbe.relations/icons/help.png");

		final MPart lPart = MBasicFactory.INSTANCE.createPart();
		lPart.setContributionURI(Constants.HELP_VIEW);
		lPart.setIconURI("platform:/plugin/org.elbe.relations/icons/help.png");
		lHelpWindow.getChildren().add(lPart);
		inApplication.getChildren().add(lHelpWindow);
	}
}
