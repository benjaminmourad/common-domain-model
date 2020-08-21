package org.isda.cdm.processor;

import java.util.List;

import com.regnosys.rosetta.common.translation.MappingContext;
import com.regnosys.rosetta.common.translation.Path;
import com.rosetta.model.lib.path.RosettaPath;

/**
 * CME Submission mapping processor.
 *
 * Mapper must be in same namespace as the type it is used for.
 */
@SuppressWarnings("unused")
public class CmeCounterpartyEnumMappingProcessor extends cdm.base.staticdata.party.processor.CmeCounterpartyEnumMappingProcessor {

	public CmeCounterpartyEnumMappingProcessor(RosettaPath modelPath, List<Path> synonymPaths, MappingContext mappingContext) {
		super(modelPath, synonymPaths, mappingContext);
	}
}