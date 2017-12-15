(require 'boot.repl)

(swap! boot.repl/*default-dependencies* conj
       '[refactor-nrepl "2.3.1"]
       '[cider/cider-nrepl "0.15.0"])

(swap! boot.repl/*default-middleware*
       conj 'cider.nrepl/cider-middleware
       conj 'refactor-nrepl.middleware/wrap-refactor)
