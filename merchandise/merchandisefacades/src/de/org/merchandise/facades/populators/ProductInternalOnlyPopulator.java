/**
 *
 */
package de.org.merchandise.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


/**
 * @author mtiwa6
 *
 */
public class ProductInternalOnlyPopulator implements Populator<ProductModel, ProductData>
{

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.converters.Populator#populate(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void populate(final ProductModel source, final ProductData target) throws ConversionException
	{
		target.setInternalOnly(source.getInternalFlag() != null ? source.getInternalFlag().booleanValue() : false);

	}

}
