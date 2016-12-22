package com.github.acleasby.maven.requirejs;

import org.mozilla.javascript.ErrorReporter;

import java.io.File;

public interface Runner {
    ExitStatus exec( File mainScript, String[] args, ErrorReporter reporter );
}
