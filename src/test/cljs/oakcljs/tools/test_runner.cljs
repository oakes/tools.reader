(ns oakcljs.tools.test-runner
  (:require oakcljs.tools.metadata-test
            oakcljs.tools.reader-test
            oakcljs.tools.reader-edn-test
            [cljs.test :refer-macros [run-all-tests]]))

(enable-console-print!)
(run-all-tests)
