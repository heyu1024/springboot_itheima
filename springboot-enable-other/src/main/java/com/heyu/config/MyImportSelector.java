package com.heyu.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author heyu
 * @date 2021-08-15 20:58
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.heyu.bean.User","com.heyu.bean.Role"};
    }
}
