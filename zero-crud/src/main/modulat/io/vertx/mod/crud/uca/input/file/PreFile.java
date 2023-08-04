package io.vertx.mod.crud.uca.input.file;

import io.vertx.mod.crud.cv.Pooled;
import io.vertx.mod.crud.uca.input.Pre;

/**
 * @author lang : 2023-08-04
 */
public interface PreFile {
    static Pre fileIn(final boolean createOnly) {
        if (createOnly) {
            return Pooled.CC_PRE.pick(FileUploadPre::new, FileUploadPre.class.getName());
        } else {
            return Pooled.CC_PRE.pick(FileSavePre::new, FileSavePre.class.getName());
        }
    }

    static Pre fileOut() {
        return Pooled.CC_PRE.pick(FileRemovePre::new, FileRemovePre.class.getName());
    }

    static Pre fileData() {
        return Pooled.CC_PRE.pick(FileFetchPre::new, FileFetchPre.class.getName());
    }
}
