/**
 *
 */
package de.org.merchandise.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.springframework.util.Assert;


/**
 * @author mtiwa6
 *
 */
public class SearchResultProductInternalOnlyPopulator implements Populator<SearchResultValueData, ProductData>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException
	{
		Assert.notNull(source, "Parameter source cannot be null.");
		Assert.notNull(target, "Parameter target cannot be null.");
		final Boolean internalOnlyFlag = (Boolean) source.getValues().get("internalOnly");
		target.setInternalOnly(internalOnlyFlag == null ? false : internalOnlyFlag.booleanValue());

	}

}
