(defproject cambium/cambium.codec-simple "1.0.0-beta4"
  :description "Simple Cambium codec with no support for nested log attributes"
  :url "https://github.com/cambium-clojure/cambium.codec-simple"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.2.0"
  :pedantic? :abort
  :global-vars {*assert* true
                *warn-on-reflection* true
                *unchecked-math* :warn-on-boxed}
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :c05 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :c06 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :c07 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :c08 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :c09 {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :c10 {:dependencies [[org.clojure/clojure "1.10.1"]]}
             :dln {:jvm-opts ["-Dclojure.compiler.direct-linking=true"]}}
  :aliases {"test-all" ["with-profile" "c05:c06:c07:c08:c09:c10" "test"]})
