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
package org.elbe.relations.internal.wizards.e4;

import org.eclipse.ui.PlatformUI;

/**
 * Registry that contains wizards contributed via the <code>exportWizards</code>
 * extension point.
 * 
 * @author Luthiger
 * @see org.eclipse.ui.internal.wizards.ExportWizardRegistry
 */
@SuppressWarnings("restriction")
public class ExportWizardRegistry extends AbstractExtensionWizardRegistry {
	private static final String PL_EXPORT = "exportWizards";

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.elbe.relations.internal.wizards.e4.AbstractExtensionWizardRegistry
	 * #getExtensionPoint()
	 */
	@Override
	protected String getExtensionPoint() {
		return PL_EXPORT;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.elbe.relations.internal.wizards.e4.AbstractExtensionWizardRegistry
	 * #getPlugin()
	 */
	@Override
	protected String getPlugin() {
		return PlatformUI.PLUGIN_ID;
	}

}
