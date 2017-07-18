/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.org.merchandise.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.product.Product;

import de.org.merchandise.core.constants.MerchandiseCoreConstants;
import de.org.merchandise.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 *
 */
@SuppressWarnings("PMD")
public class MerchandiseCoreManager extends GeneratedMerchandiseCoreManager
{
	public static final MerchandiseCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (MerchandiseCoreManager) em.getExtension(MerchandiseCoreConstants.EXTENSIONNAME);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.org.merchandise.core.jalo.GeneratedMerchandiseCoreManager#isInternalFlag(de.hybris.platform.jalo.
	 * SessionContext, de.hybris.platform.jalo.product.Product)
	 */
	@Override
	public Boolean isInternalFlag(final SessionContext ctx, final Product item)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.org.merchandise.core.jalo.GeneratedMerchandiseCoreManager#setInternalFlag(de.hybris.platform.jalo.
	 * SessionContext, de.hybris.platform.jalo.product.Product, java.lang.Boolean)
	 */
	@Override
	public void setInternalFlag(final SessionContext ctx, final Product item, final Boolean value)
	{
		// YTODO Auto-generated method stub

	}
}
