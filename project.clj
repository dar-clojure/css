(defproject dar/css "0.0.1-SNAPSHOT"
  :target-path "build/target"
  :clean-targets ["build"]
  :plugins [[dar/assets-lein "0.0.1-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.5.1"]
                                  [dar/assets "0.0.1-SNAPSHOT"]]
                   :assets {:build-dir "build/assets"
                            :pre-include ["dar/css/normalize" "dar/css/test"]
                            :server-port 3000}}})
