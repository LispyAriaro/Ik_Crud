(defproject ikcrud "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [jline "2.11"]
                 [org.clojure/core.match "0.3.0-alpha4"]]
  
  :resource-paths ["resources"]
  
  :main ikcrud.core
  :uberjar-name "ikcrud.jar"
  :profiles {:uberjar {:aot :all}})
