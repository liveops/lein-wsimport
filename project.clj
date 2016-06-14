(defproject liveops/lein-wsimport "2.0.0"
  :description "JAX-WS import plugin for Clojure projects"
  :url "https://github.com/liveops/lein-wsimport"
  :dependencies [[com.sun.xml.ws/jaxws-tools "2.2.8"]]
  :profiles { :dev { :dependencies [[midje "1.6-beta1"]]}}
  :plugins [[lein-midje "3.1.2"]
            [lein-clojars "0.9.1"]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :manifest {"Git-Commit" ~(System/getenv "GIT_COMMIT")
             "Build-Tag"  ~(System/getenv "BUILD_TAG")}
  :repositories [["releases" {:url "http://nexus.liveopslabs.com/content/repositories/releases/"
                              :snapshots false}]
                 ["snapshots" {:url "http://nexus.liveopslabs.com/content/repositories/snapshots/"
                               :update :always}]])
